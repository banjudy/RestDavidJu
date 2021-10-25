package progmat.BanJu.RestDavidJu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import progmat.BanJu.RestDavidJu.service.GameService;

@RestController
public class GameController {

    private GameService service;

    @Autowired
    public GameController(GameService service) {
        this.service = service;
    }
    @GetMapping("/game")
    public String getGamePage() {
        return "game";
    }

    @GetMapping(value = { "/play"})
    public String getGameNumber() {
        int userNumber = service.random(1, 20);
        int programNumber = service.random(1, 20);

        String userText = service.getTextWithNumber(true, userNumber);
        String programText = service.getTextWithNumber(false, programNumber);

        String winner = service.getWinnerMsg(userNumber, programNumber);

        /*model.addAttribute("userText", userText);
        model.addAttribute("programText", programText);
        model.addAttribute("winner", winner);*/
        return userText + programText + winner;
    }
}
