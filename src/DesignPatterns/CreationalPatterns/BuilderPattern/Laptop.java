package DesignPatterns.CreationalPatterns.BuilderPattern;

public class Laptop {
    private String brand;
    private String processor;
    private int ram;
    private int ssd;
    private boolean touchScreen;
    private boolean RGBKeyboard;

    // Private constructor taking Builder instance
    private Laptop(Builder builder) {
        this.brand = builder.brand;
        this.processor = builder.processor;
        this.ram = builder.ram;
        this.ssd = builder.ssd;
        this.touchScreen = builder.touchScreen;
        this.RGBKeyboard = builder.RGBKeyboard;
    }

    public static class Builder {
        private String brand;
        private String processor;
        private int ram;
        private int ssd;
        private boolean touchScreen;
        private boolean RGBKeyboard;

        // Enforce mandatory parameters via constructor
        public Builder(String brand, String processor) {
            this.brand = brand;
            this.processor = processor;
        }

        public Builder ram(int ram) {
            this.ram = ram;
            return this;
        }

        public Builder ssd(int ssd) {
            this.ssd = ssd;
            return this;
        }

        public Builder touchScreen(boolean touchScreen) {
            this.touchScreen = touchScreen;
            return this;
        }

        public Builder RGBKeyboard(boolean RGBKeyboard) {
            this.RGBKeyboard = RGBKeyboard;
            return this;
        }

        public Laptop build() {
            return new Laptop(this);
        }
    }
}
