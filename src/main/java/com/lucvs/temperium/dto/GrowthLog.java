package com.lucvs.temperium.dto;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(
        name = "growth_log",
        uniqueConstraints = @UniqueConstraint(columnNames = {"tempino_instance_id", "date"})
)
public class GrowthLog {

    // fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tempino_instance_id", nullable = false)
    private TempinoInstance tempinoInstance;

    @Column(name = "date", nullable = false)
    private LocalDate date;

    @Column(name = "total_exp", nullable = false)
    private int totalExp;

    // constructor
    public GrowthLog() {}

    public GrowthLog(TempinoInstance tempinoInstance, LocalDate date, int totalExp) {
        this.tempinoInstance = tempinoInstance;
        this.date = date;
        this.totalExp = totalExp;
    }

    // getter/setter
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public TempinoInstance getTempinoInstance() { return tempinoInstance; }
    public void setTempinoInstance(TempinoInstance tempinoInstance) { this.tempinoInstance = tempinoInstance; }
    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }
    public int getTotalExp() { return totalExp; }
    public void setTotalExp(int totalExp) { this.totalExp = totalExp; }
}
