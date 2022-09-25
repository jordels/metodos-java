public class TvSmart{

boolean ligada = false;
/**
 * @return
 */
public boolean Ligada() {
    return ligada;
}

public void setLigada(boolean ligada) {
    this.ligada = ligada;
}

int canal = 1;

int volume = 25;

public void ligar(){

    ligada = true;

}

public void desligar(){

    ligada = false;
}

}