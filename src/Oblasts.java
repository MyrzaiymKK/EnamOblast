public enum Oblasts {
    CHUI{
        @Override
        public String getInfo() {
            return "Burana";
        }
    },
    NARYN{
        @Override
        public String getInfo() {
            return "Tash Rabat";
        }
    },
    OSH{
        @Override
        public String getInfo() {
            return "Sulaiman Too";
        }
    },
    BATCEN{
        @Override
        public String getInfo() {
            return "Oruk";
        }
    },
    DJALALABAD{
        @Override
        public String getInfo() {
            return "Arslan Bab";
        }
    },
    TALAS{
        @Override
        public String getInfo() {
            return "Manas Kumbozu";
        }
    },
    YSSYKKOL{
        @Override
        public String getInfo() {
            return "Kol";
        }
    };


    public abstract String getInfo();
}
