public class Pacientes implements Comparable<Pacientes> {
    private String nombre;
    private String sintoma;
    private char codigo;

    public Pacientes(String nombre, String sintoma, char codigo) {
        this.nombre = nombre;
        this.sintoma = sintoma;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSintoma() {
        return sintoma;
    }

    public char getCodigo() {
        return codigo;
    }

    @Override
    public int compareTo(Pacientes otroPaciente) {
        return this.codigo - otroPaciente.getCodigo();
    }

    @Override
    public String toString() {
        return nombre + ", " + sintoma + ", " + codigo;
    }
}

