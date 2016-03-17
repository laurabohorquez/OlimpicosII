package olimpicose;

public class Delegacion {
    java.util.Scanner lectura = new java.util.Scanner(System.in);
    private String pais;
    private int oro;
    private int plata;
    private int bronce;
    private Grupo []grupos = new Grupo[5];
    int i;

    public Delegacion(String pais) {
        this.pais = pais;
        for (i = 0; i < 5; i++){
            this.grupos[i] = new Grupo("");
        }
    }

    public void setDelegacion() {
        System.out.print("Ingrese el nombre del pais: ");
        this.pais = lectura.next();
        System.out.print("Ingrese el número de medallas de oro: ");
        this.oro = lectura.nextInt();
        System.out.print("Ingrese el número de medallas de plata: ");
        this.plata = lectura.nextInt();
        System.out.print("Ingrese el número de medallas de bronce: ");
        this.bronce = lectura.nextInt();
        //AVISO IMPORTANTE i < 1 PARA PRUEBAS, SI NO CAMBIAR A i < 5
        for (i = 0; i < 1; i++){
            this.grupos[i].setGrupo();
        }
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getOro() {
        return oro;
    }

    public void setOro(int oro) {
        this.oro = oro;
    }

    public int getPlata() {
        return plata;
    }

    public void setPlata(int plata) {
        this.plata = plata;
    }

    public int getBronce() {
        return bronce;
    }

    public void setBronce(int bronce) {
        this.bronce = bronce;
    }

    public void setGrupos() {
        for (i = 0; i < 5; i++){
            this.grupos[i].setGrupo();
        }
    }
    
    public void encontrarGrupo(String Deporte){
        for (i = 0; i < 5; i++){
            if(this.grupos[i].getNombreDeporte().equals(Deporte)){
                System.out.println(this.getPais() + "\n Miembros: ");
                this.grupos[i].verIntegrantes();
            }
        }
        
    }
    
}
