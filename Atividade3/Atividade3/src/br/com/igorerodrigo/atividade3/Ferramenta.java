package br.com.igorerodrigo.atividade3;

public class Ferramenta extends Produto{
    
    private String marca;
    private int garantia;
    private String material;

    public Ferramenta(String nom, int qua, double pre, String mar, int gar, String mat) {
        super(nom, qua, pre);
        this.marca = mar;
        this.garantia = gar;
        this.material = mat;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the garantia
     */
    public int getGarantia() {
        return garantia;
    }

    /**
     * @param garantia the garantia to set
     */
    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    /**
     * @return the material
     */
    public String getMaterial() {
        return material;
    }

    /**
     * @param material the material to set
     */
    public void setMaterial(String material) {
        this.material = material;
    }
    
    
    
}
