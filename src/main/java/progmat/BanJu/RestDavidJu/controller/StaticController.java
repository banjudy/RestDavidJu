package progmat.BanJu.RestDavidJu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import progmat.BanJu.RestDavidJu.model.HoffInfo;
import progmat.BanJu.RestDavidJu.service.DataService;

import java.util.List;

@RestController
public class StaticController {

    @Autowired
    private DataService service;

    @GetMapping("/earlylife")
    public HoffInfo getEarlyLife() {
        return service.getHoffInfoAboutEarlyLife();
    }
    @GetMapping("/earlycareer")
    public List<HoffInfo> getEarlyCareer() {
        return service.getHoffInfoEarlyCareer();
    }

    @GetMapping("/latercareer")
    public List<HoffInfo> getLaterCareer() {
        return service.getHoffInfoLaterCareer();
    }

    @GetMapping("/musiccareer")
    public List<HoffInfo> getMusicCareer() {
        return service.getHoffInfoMusicCareer();
    }

    @GetMapping("/personallife")
    public List<HoffInfo> getPersonalLife() {
        return service.getHoffInfoPersonalLife();
    }
    @GetMapping("/awards")
    public HoffInfo getAwards() {
        return service.getHoffInfoAwards();
    }

}


