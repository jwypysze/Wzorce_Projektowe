package sda.solid.dip;

public class TaskService {

    /**
     * to co widać czyli generowanie 1 obiektu wewnątrz drugiego to tzw. High Coupling - silne wiązanie
     * czyli mamy 2 obiekty z których 1 mocno zależy od drugiego i "umie" go utworzyć
     * co w sumie łamie SRP
     * bo powinien zając się swoimi zadaniami a nie tworzeniem innych obiektów
     */
    private FileRepository repository = new FileRepository();
    public void addTask(String filename){
        repository.saveTask(filename);
    }
    public void removeTask(String filename){
        repository.deleteTask(filename);
    }
}
