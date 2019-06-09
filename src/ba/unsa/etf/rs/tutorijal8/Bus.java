package ba.unsa.etf.rs.tutorijal8;

public class Bus {
    private String maker,series;
    private int seatNumber;

    Integer driverOne = null;
    Integer driverTwo = null;
    Integer idBus = null;

    public Bus() {
    }

    public Bus(String maker, String series, int seatNumber) {
        this.maker = maker;
        this.series = series;
        this.seatNumber = seatNumber;
    }

    public Bus(Integer idBus,String maker, String series, int seatNumber) {
        this.idBus = idBus;
        this.maker = maker;
        this.series = series;
        this.seatNumber = seatNumber;
    }

    public Bus(Integer idBus,String maker, String series, int seatNumber, Integer driverOne, Integer driverTwo) {
        this.idBus = idBus;
        this.maker = maker;
        this.series = series;
        this.seatNumber = seatNumber;
        this.driverOne = driverOne;
        this.driverTwo = driverTwo;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public Integer getDriverOne() {
        return driverOne;
    }

    public void setDriverOne(Driver driverOne) {
        this.driverOne = driverOne;
    }

    public Integer getDriverTwo() {
        return driverTwo;
    }

    public void setDriverTwo(Driver driverTwo) {
        this.driverTwo = driverTwo;
    }

    public Integer getIdBus() {
        return idBus;
    }

    public void setIdBus(Integer idBus) {
        this.idBus = idBus;
    }

    @Override
    public String toString () {
        String ime = "";
        ime += this.maker + " " + this.series + " ( seats: " + this.getSeatNumber() + " )";
        if (driverOne != null) {
            ime += driverOne.toString();
        }
        if (driverTwo != null) {
            ime += driverTwo.toString();
        }
        return ime;
    }

    public boolean equals(Bus bus) {
        if (idBus != null) {
            return (bus.getIdBus().equals(this.getIdBus()));
        }
        return false;
    }
}
