package ba.unsa.etf.rs.tutorijal8;

public class Bus {
    private String maker,series;
    private int seatNumber;

    private Driver driverOne = null;
    private Driver driverTwo = null;
    Integer id = null;

    public Bus() {
    }

    public Bus(String maker, String series, int seatNumber) {
        this.maker = maker;
        this.series = series;
        this.seatNumber = seatNumber;
    }

    public Bus(int id,String maker, String series, int seatNumber) {
        this.id = id;
        this.maker = maker;
        this.series = series;
        this.seatNumber = seatNumber;
    }

    public Bus(int id,String maker, String series, int seatNumber, Driver driverOne, Driver driverTwo) {
        this.id = id;
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

    public Driver getDriverOne() {
        return driverOne;
    }

    public void setDriverOne(Driver driverOne) {
        this.driverOne = driverOne;
    }

    public Driver getDriverTwo() {
        return driverTwo;
    }

    public void setDriverTwo(Driver driverTwo) {
        this.driverTwo = driverTwo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
        if (id != null) {
            return (bus.getId().equals(this.getId()));
        }
        return false;
    }

    public int setId() {
        return 0;
    }
}