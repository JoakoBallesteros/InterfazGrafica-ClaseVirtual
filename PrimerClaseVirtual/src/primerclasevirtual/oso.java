package primerclasevirtual;

class Oso extends Animal implements HabitatBosque {
    public Oso(String nombre, int edad, double peso) {
        super(nombre, edad, peso, "Ursus arctos");
    }

    @Override
    public void comer() {
        System.out.println(nombre + " come frutos, raíces y miel del bosque");
        energia = Math.min(100, energia + 25);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " ruge poderosamente");
    }

    @Override
    public void moverse() {
        if (energia >= 15) {
            System.out.println(nombre + " camina pesadamente entre los árboles");
            energia -= 12;
        } else {
            System.out.println(nombre + " está demasiado cansado para moverse");
        }
    }

    @Override
    public String getTipoHabitat() {
        return "Bosques y montañas";
    }

    // Métodos del HabitatBosque
    @Override
    public void refugiarse() {
        System.out.println(nombre + " se refugia en una cueva");
    }

    @Override
    public void buscarComidaBosque() {
        System.out.println(nombre + " busca salmones en un río del bosque");
    }

    @Override
    public void marcarTerritorio() {
        System.out.println(nombre + " se frota contra los árboles para dejar su olor");
    }
}
