class Guitar extends Instrument {
    public Guitar(String name, String brand) {
        super(name, brand);
    }

    public void play() {
        System.out.println("Playing guitar: strumming strings...");
    }