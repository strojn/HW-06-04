public enum Animals {
    CAT(10),
    DOG(12);
    final int animalAge;

    @Override
    public String toString() {
        return "Animals{" +
                this.name() +
                " have animalAge=" + animalAge +
                '}';
    }
    Animals(int animalAge) {
        this.animalAge = animalAge;
    }
}
