package models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
public class HardDrive {
    //dhfjdshfjdfjsffsdfsdfds
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public  int id ;
    @NonNull
    private String modelHD;
    @NonNull
    private boolean SSD;
    @NonNull
    private int sizeHD;
    @NonNull
    private  String countryHD;
    @NonNull
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(nullable = false)
    private Computer computer;

    public Computer getComputer() {
        return computer;
    }

    public void setComputer (Computer computer ) {
        this.computer = computer;
    }





}

