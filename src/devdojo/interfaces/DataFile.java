package devdojo.interfaces;

public class DataFile implements DataCheck {

    @Override
    public void dataRead() {
        // TODO Auto-generated method stub
        System.out.println("Lendo dados do arquivo");
    }

    @Override
    public void dataDelete() {
        // TODO Auto-generated method stub
        System.out.println("Removendo dados do arquivo");
    }

}
