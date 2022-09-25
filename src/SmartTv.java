
public class SmartTv{
static boolean ligada = false;
/**
 * @return
 */
public boolean Ligada() {
    return ligada;
}

/**
 * @param ligada
 */
public void setLigada(boolean ligada) {
    SmartTv.ligada = ligada;
}

int canal = 1;

int volume = 25;

public void ligar(){

    ligada = true;

}

public static void desligar(){

    ligada = false;
}

public String ligada() {
    return null;
}

}