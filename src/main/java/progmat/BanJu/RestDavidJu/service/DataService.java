package progmat.BanJu.RestDavidJu.service;

import org.springframework.stereotype.Service;
import progmat.BanJu.RestDavidJu.model.HoffInfo;

import java.util.Arrays;
import java.util.List;

@Service
public class DataService {

    public HoffInfo getHoffInfoAboutEarlyLife() {
        return new HoffInfo("Early life\r\n", "Hasselhoff was born in Baltimore, Maryland in 1930, April 23. \r\n" +
                "He spent his childhood in Florida, and later lived in Atlanta, Georgia, \r\n" +
                "where he attended Marist School. \r\nHasselhoff made his theatrical debut at the age of seven in Peter Pan, \r\n" +
                " and ever since his childhood dream was to have a career on Broadway.");
    }

    public List<HoffInfo> getHoffInfoEarlyCareer() {
        return Arrays.asList(
                new HoffInfo("Early career\r\n",
                        "Hasselhoff was recruited by then NBC President Brandon Tartikoff \r\nto star in the " +
                                "science-fiction series Knight Rider from 1982 to 1986 as Michael Knight. \r\n" +
                                "He has described Knight Rider as more than a TV show: \"It's a phenomenon. \r\n" +
                                "It's bigger than Baywatch ever was.\r\n"),
                new HoffInfo("Early career\r\n",
                        "Hasselhoff returned to television on Baywatch \r\n which premiered in 1989. "));
    }

    public List<HoffInfo> getHoffInfoLaterCareer() {
        return Arrays.asList(
                new HoffInfo("Later career\r\n",
                        "In 2006, fans of David Hasselhoff launched a tongue-in-cheek website\r\n" +
                                "\"Get Hasselhoff to Number 1\"[46] in an attempt to get the 1989 hit\r\n " +
                                "\"Looking for Freedom\" to the top of the UK music charts through Internet\r\n " +
                                "downloads of the single. \r\n"),
                new HoffInfo("Later career\r\n",
                        "In 2008 Hasselhoff launched a MySpace-like social networking site, \r\n" +
                                "known as \"HoffSpace\"."),
                new HoffInfo("Later career\r\n",
                        "Hasselhoff and his daughters, Taylor-Ann and Hayley, \r\n" +
                                "starred in a reality series on A&E called The Hasselhoffs.\r\n"),
                new HoffInfo("Later career\r\n",
                        "In 2014, UK channel Dave announced that it had commissioned Hoff the Record,\r\n" +
                                "a sitcom series in which Hasselhoff plays a fictionalized version of himself.")
        );

    }
    public List<HoffInfo> getHoffInfoMusicCareer(){
        return Arrays.asList(
                new HoffInfo("Music career\r\n",
                        "On February 2, 1977, David Hasselhoff made his musical debut \r\non The Merv Griffin Show performing \"Nadia's Theme\".\r\n"),
                new HoffInfo("Music career\r\n",
                        "In 1988, Hasselhoff released the song \"Looking for Freedom\",\r\n which became a hit in Europe, specially in Germany.\r\n"),
                new HoffInfo("Music career\r\n",
                        "In August of 1990 year, Hasselhoff released his fourth studio album, \r\nCrazy for You, which topped the charts in Austria and Switzerland\r\n")
        );
    }
    public List<HoffInfo> getHoffInfoPersonalLife(){
        return Arrays.asList(
                new HoffInfo("Personal life\r\n",
                        "Hasselhoff was married to actress Catherine Hickland from '84 until '89. \r\n" +
                                "Then Hasselhoff married actress Pamela Bach in December 1989.\r\n The couple have two daughters\r\n"),
                new HoffInfo("Personal life\r\n",
                        "On May 3, 2007, a viral video surfaced online of Hasselhoff \r\nappearing to be severely drunk inside his home. \r\n" +
                                "His daughter, Taylor Ann, who filmed the video, can be heard interrogating him \r\n" +
                                "and asking him to stop abusing alcohol.\r\n")
        );
    }
    public HoffInfo getHoffInfoAwards() {
        return new HoffInfo("Awards\r\n",
                "1983 – Favorite Male Performer in a New TV Program: People's Choice Awards\r\n" +
                        "2005 – International Star of the Year Award \nfor Outstanding Contribution to Global Entertainment: " +
                        "Bollywood Awards\r\n" +
                        "2006 – Comeback Star of the Year: VH1 Big in '06 Awards\r\n" +
                        "2010 – The Comedy Central Roast of David Hasselhoff: Comedy Central.");
    }
}
