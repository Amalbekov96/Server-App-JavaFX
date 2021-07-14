package kg.one.serverapp.Model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name ="positions")
public class Position {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String name;

    private boolean active;
}
