package net.weather;

class NewscastClient
{
    public static void main(String[] args)
    {
        // Instantiate the object
        Newscast news = new Newscast();

        news.playWeatherSegment(city -> "Raining","Seattle");

    }
}
