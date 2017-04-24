package cz.pedry.examplespringapp.controller;

import cz.pedry.examplespringapp.entity.Sprite;
import cz.pedry.examplespringapp.model.Circle;
import cz.pedry.examplespringapp.model.Rectangle;
import cz.pedry.examplespringapp.repository.SpriteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @Autowired
    private SpriteRepository spriteRepository;

    @RequestMapping("/")
    public String mainPage() {

        spriteRepository.save(new Sprite(new Circle(Math.random(), Math.random(), Math.random())));
        spriteRepository.save(new Sprite(new Rectangle(Math.random(), Math.random(), Math.random() + 1, Math.random() + 1)));

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Two Sprites are added on page refresh. <br/>\n");
        stringBuilder.append("Every Sprite has one Geometry, every geometry = one cell in database <br/>\n");
        stringBuilder.append("Geometry can be Circle or Rectangle <br/>\n");
        stringBuilder.append("Actual list of Sprites: <br/>\n");
        stringBuilder.append("<br/>\n");

        Iterable<Sprite> allSprites = spriteRepository.findAll();
        for (Sprite s : allSprites) {
            stringBuilder.append(s + "<br/>\n");
        }

        return stringBuilder.toString();
    }

}
