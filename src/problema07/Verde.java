package problema07;

public class Verde implements Estado {
    @Override
    public void mudar(Sinaleira sinaleira) {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sinaleira.setEstado(new Amarelo());
    }

    @Override
    public String getEstado() {
        return "Verde";
    }
}
