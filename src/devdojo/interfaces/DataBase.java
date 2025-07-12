package devdojo.interfaces;

public class DataBase implements DataCheck {

    @Override
    public void dataRead() {
        // TODO Auto-generated method stub
       System.out.println("Lendo dados do banco de dados");
    }

    @Override
    public void dataDelete() {
        // TODO Auto-generated method stub
        System.out.println("Removendo dados do banco de dados");
    }

}
