package Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String detail;
    @Column(columnDefinition = "DATETIME NOT NULL " +
    "DEFAULT CURRENT_TIMESTAMP",
    updatable = false ,
    insertable =  false)
    private LocalDateTime insertTime;

    @OneToOne
    @MapsId
    private User user;
    public Address(String detail){
        this.detail = detail;
    }

}
