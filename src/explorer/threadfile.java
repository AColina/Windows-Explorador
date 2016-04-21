package explorer;


/**
 *
 * @author Administrador
 */
public class threadfile extends Thread{
    private String [] Archivos;
    private int pocision;
            
    threadfile(String [] Archivos){
        this.Archivos=Archivos;
        pocision=0;
        start();
    }

    @Override
    public void run() {
        int fol=0; int fil=0;
        while(pocision<Archivos.length){
            if (new java.io.File(Archivos[pocision]).isDirectory()) {
                fol++;
                popuphelps.setFolder(""+fol);
            }else{
                fil++;
                popuphelps.setFiles(""+fil);
            }
            pocision++;
        }
        try {
            finalize();
        } catch (Throwable ex) {
        }
    }
    
    
}
