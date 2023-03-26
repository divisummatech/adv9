class Piano extends Instrument {
    public Piano(String name, String brand) {
        super(name, brand);
    }

    public void play() {
        System.out.println("Playing piano: pressing keys...");
    }
}