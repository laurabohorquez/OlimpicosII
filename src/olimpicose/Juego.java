package olimpicose;

public class Juego {
    
    java.util.Scanner lectura = new java.util.Scanner(System.in);
    private Delegacion []delegaciones = new Delegacion[10];
    int i;

    public Juego() {
        for(i=0;i<10;i++){
            this.delegaciones[i] = new Delegacion(""); 
        }
    
    }
    
    
    public void setJuego(){
        for(i = 0; i < 10; i++){
            if(this.delegaciones[i].getPais().isEmpty()){
                this.delegaciones[0].setDelegacion();
                break;
            }
            else{
                System.out.println("Delegaciones completas");
            }
        }
    }
    
    
    public Delegacion verDelegacion(int pos){
        return this.delegaciones[i];
    }
    
    public Delegacion verDelgacionNombre(String Nombre){
        Delegacion delRetorno = null;
        for(i = 0; i < 10; i++){
            if(this.delegaciones[i].getPais().equals(Nombre)){
                delRetorno = this.delegaciones[i];
            }
        }
        return delRetorno;
    }
    
    public void encontrarDeporte(){
        System.out.print("Ingrese el deporte: ");
        String Deporte = lectura.next();
        for(i = 0; i < this.delegaciones.length; i++){
            this.delegaciones[i].encontrarGrupo(Deporte);
        }
    }
    
    public void cambiarMedalla(){
        System.out.print("Escoja la delegación: ");
        String pais = lectura.next();
        System.out.print("Ingrese el tipo de medalla: ");
        String tipoMedalla = lectura.next();
        System.out.print("Ingrese la nueva cantidad: ");
        int cant = lectura.nextInt();
        if(tipoMedalla.equals("oro")){
            this.verDelgacionNombre(pais).setOro(cant);
        }
        if(tipoMedalla.equals("plata")){
            this.verDelgacionNombre(pais).setPlata(cant);
        }
        if(tipoMedalla.equals("bronce")){
            this.verDelgacionNombre(pais).setBronce(cant);
        }
    }
    
    public void mejorDelegacion(){
        int consulta[][] = new int[1][2];
        consulta[0][0] = 0;
        consulta[0][1] = this.delegaciones[0].getOro()+
                         this.delegaciones[0].getPlata()+
                         this.delegaciones[0].getBronce();
        for(i=1; i<this.delegaciones.length; i++){
            if(this.delegaciones[i].getOro()+
               this.delegaciones[i].getPlata()+
               this.delegaciones[i].getBronce() > consulta[0][1]){
                
                consulta[0][0] = i;
                consulta[0][1] = this.delegaciones[i].getOro()+
                                 this.delegaciones[i].getPlata()+
                                 this.delegaciones[i].getBronce();
            }
        }
        System.out.println("\nLa mejor delegacion es: " + this.delegaciones[consulta[0][0]].getPais()+
                            "con " + consulta[0][1] 
                             + " medallas.\n");
    }
}
