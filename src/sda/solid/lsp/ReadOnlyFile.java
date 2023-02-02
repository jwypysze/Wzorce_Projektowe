package sda.solid.lsp;

public class ReadOnlyFile implements FileOperation{
    @Override
    public byte[] read(String filename) {
        System.out.println("Reading from file: " + filename);
        return new byte[0];
    }

    /**
     * Korzystanie z interface'u FileOperation zakłada implementację 2 metod
     * Dla plików tylko do odczytu metoda write() jest niepotrzebna
     * a nawet szkodliwa ale zaimplementować trzeba
     * To powoduje że naruszona jest zasada Liskov bo użycie metody write ()
     * nie kończy się zapisaniem zawartości pliku
     *
     */
    @Override
    public void write(String filename, byte[] content) {
        throw new UnsupportedOperationException("Can't write to read-only file");
        //nie możemy nic zapisać w pliku tylko do odczytu
    }
}
