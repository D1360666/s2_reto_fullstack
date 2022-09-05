import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { apiService } from 'src/app/shared/services/api.service';
import { AuthService } from 'src/app/shared/services/auth.service';
import { Carta } from 'src/app/shared/model/carta';
import { Juego } from 'src/app/shared/model/juego';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  title = 'Mantenimiento de Cartas';
  carta:Carta[]=[];
  cartaModel= new Carta();
  juegoModel= new Juego;
  juego:Juego[]=[];

  constructor(private api:apiService, private router: Router) { }

  ngOnInit(): void {
   // this.refreshCarta()
    this.refreshGame()
  }


  btnNewGame(){
    //alert('pp');
    //this.router.navigate(['newgame']);
    this.addGame();
  }
  
  btnGameList(){
    this.router.navigate(['list']);
  }

  addGame(){
    this.api.addGames(this.juegoModel)
    .subscribe(data => {console.log(data)
    this.refreshGame();
    })
  }

  refreshGame(){
    this.api.getGames()
    .subscribe(data=>{
      console.log(data)
      this.juego=data;
    })
  }

refreshCarta(){
  this.api.getCards()
  .subscribe(data => {
    console.log(data)
    this.carta=data;
  })
}

  addCarta(){
    this.api.addCards(this.cartaModel)
    .subscribe(data => {
      console.log(data)
      this.refreshCarta();
    })
  }
}
