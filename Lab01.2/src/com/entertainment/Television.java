package com.entertainment;

import java.util.Objects;

public class Television implements Comparable<Television>
{
    private String brand;
    private int volume;
    private Tuner tuner = new Tuner();

    //Constructors


    public Television()
    {
    }

    public Television(String brand, int volume)
    {
        setBrand(brand);
        setVolume(volume);
    }

    //Business methods
    public int getCurrentChannel()
    {
        return tuner.getChannel();
    }
    public void changeChannel(int channel)
    {
        tuner.setChannel(channel);
    }


    public String getBrand()
    {
        return brand;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public int getVolume()
    {
        return volume;
    }

    public void setVolume(int volume)
    {
        this.volume = volume;
    }

    // class Object methods

    /*
     * This is my own personal Implementation, not the generated one from IJ.
     */

//    @Override
//    public boolean equals(Object obj)
//    {
//        boolean result = false;
//        //return this == obj; // inherited version from Object
//
//        // check if really instance of Television
//        if (obj instanceof Television)
//        {
//            // safely downcast obj to a more specific reference type
//            Television other = (Television) obj;
//            // do the checks
//            result = Objects.equals(this.getBrand(), other.getBrand()) &&
//                    Objects.equals(this.getVolume(), other.getVolume());
//        }
//        return result;
//    }
//
//    @Override
//    public int hashCode()
//    {
//        return Objects.hash(getBrand(),getVolume());
//
//    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Television that = (Television) o;
        return getVolume() == that.getVolume() && Objects.equals(getBrand(), that.brand);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(brand, volume);
    }

    @Override // Comparable implements
    public int compareTo(Television other)
    {
        // if the sort key (brand in this case). a String, is also Comparable. let it decide
        return this.getBrand().compareTo(other.getBrand());
    }

    // toString()

    @Override
    public String toString()
    {
        return getClass().getSimpleName() + "brand='" + getBrand() + '\'' + ", volume=" + getVolume() + ", tuner=" + getCurrentChannel() + '}';
    }
}
