package com.lucvs.temperium.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tempino_instance")
public class TempinoInstance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tempino_id", nullable = false)
    private Tempino tempino;

    @Column(name = "nickname", unique = true,length = 50)
    private String nickname;

    @Column(name = "level", nullable = false)
    private int level = 1;

    @Column(name = "exp", nullable = false)
    private int exp = 0;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    // constructor
    public TempinoInstance() {}

    public TempinoInstance(User user, Tempino tempino, String nickname, int level, int exp) {
        this.user = user;
        this.tempino = tempino;
        this.nickname = nickname;
        this.level = level;
        this.exp = exp;
    }

    // getter/setter
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }
    public Tempino getTempino() { return tempino; }
    public void setTempino(Tempino tempino) { this.tempino = tempino; }
    public String getNickname() { return nickname; }
    public void setNickname(String nickname) { this.nickname = nickname; }
    public int getLevel() { return level; }
    public void setLevel(int level) { this.level = level; }
    public int getExp() { return exp; }
    public void setExp(int exp) { this.exp = exp; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
}