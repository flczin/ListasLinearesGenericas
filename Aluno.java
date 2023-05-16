public class Aluno {
    int rm;
    double media;

    public Aluno(int rm, double media) {
        this.rm = rm;
        this.media = media;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "rm=" + rm +
                ", media=" + media +
                '}';
    }
}
