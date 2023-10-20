package cz.czechitas.java2webapps.ukol3.controller;

import entity.Vizitka;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Kontroler obsluhující zobrazování vizitek.
 */
@Controller
public class VizitkaController {
  private List <Vizitka> seznamVizitek = List.of(
          new Vizitka("Tomáš Marný", "Abraka", "Biskupcova 26", "Praha 13000", "abraka@dabraka.cz", "666 666 666", "www.abraka.cz"),
          new Vizitka("Pankratěvna Praskovna", "Dabraka", "Hartigova 112", "Praha 13000", null, "777 777 777", "www.dabraka.cz"),
          new Vizitka("Sysoj Psojič Rispoloženskij", "Kalimera", "Ohmova 21", "Praha 10900", null, null, "www.kalimera.cz"),
          new Vizitka("Lazar Podchaljuzin", "Kalispera", "Kurčatovova 322", "Praha 10900", null, null, null),
          new Vizitka("Martin Meloun", "Kalispera", "V Celnici 8", "Praha 11000", "meloun@pucmeloun.cz", "888 888 888", null),
          new Vizitka("Narcis Meloun", "Pučmeloun", "Příčná 4", "Praha 11000", "pucmeloun@meloun.cz", null, null),
          new Vizitka("Plznička Prazdrojová", "Prazdroj", "U Prazdroje 64", "Plzeň 30100", "plzensky@prazdroj.cz", null, "www.classic.cz")

  );
  @GetMapping("/")
   public ModelAndView seznam ()
  {
    ModelAndView modelAndView = new ModelAndView("seznam");
    modelAndView.addObject("vizitky", seznamVizitek);
    return modelAndView;
  }

  @GetMapping("/detail/{id}")
  public ModelAndView detail (@PathVariable int id){
    ModelAndView modelAndView= new ModelAndView("detail");
    modelAndView.addObject("vizitka", seznamVizitek.get(id));
    return modelAndView;
  }

}
