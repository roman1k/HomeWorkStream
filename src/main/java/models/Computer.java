package models;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;



import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table()
public class Computer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NonNull
    private String modelPC;
    @NonNull
    private int year;
    @NonNull
    private int sizeMemory;
    @NonNull
    private  int price;
    @NonNull
    private  int id_HardDrive;
    @NonNull
    @OneToMany(fetch = FetchType.EAGER )
    private List<HardDrive> hardDrive;

    public List<HardDrive> getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(List<HardDrive> hardDrives) {
        this.hardDrive = hardDrives;
    }

    @NonNull
    @OneToMany(fetch = FetchType.EAGER )
    private List<Processor> processorList;

    public List<Processor> getProcessor() {
        return processorList;
    }

    public void setProcessor(List<Processor> processors) {
        this.processorList = processors;
    }

    Computer computer = new Computer();





}
