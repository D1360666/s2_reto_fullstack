import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { AngularFirestore } from '@angular/fire/compat/firestore';
import { Observable, ObservedValueOf } from 'rxjs';
import { map } from 'rxjs/operators';
import { environment } from 'src/environments/environment';
import { CrearJuegoCommand } from '../commands/crearJuegoCommand';

import { User } from '../model/user';
import { Carta } from '../model/carta';

import { Juego } from '../model/juego';

@Injectable({
  providedIn: 'root'
})
export class apiService {


  constructor(private http: HttpClient, public afs: AngularFirestore,
  ) { }

 getGames(): Observable<Juego[]>{
  console.log('getGames ' + environment.apiBase + '/games')
  return this.http.get<Juego[]>(environment.apiBase+ '/games')
 }

 addGames(juego:Juego):Observable<any>{
  const headers = {'content-type':'application/json'}
  const body=JSON.stringify(juego);
  console.log(body);
  return this.http.post(environment.apiBase + '/games', body,{'headers':headers})
 }
 getCards(): Observable<Carta[]>{
  console.log('getCards ' + environment.apiBase + '/cards')
  return this.http.get<Carta[]>(environment.apiBase+ '/cards')
  
 }

 addCards(carta:Carta):Observable<any>{
  const headers = {'content-type':'application/json'}
  const body=JSON.stringify(carta);
  console.log(body);
  return this.http.post(environment.apiBase + '/cards', body,{'headers':headers})
 }
/*
  iniciarJuego(command: IniciarJuegoCommand){
    return this.http.post(environment.apiBase + '/juego/iniciar', command);
  }

  crearRonda(command: CrearRondaCommand){
    return this.http.post(environment.apiBase + '/juego/crear/ronda', command);
  }

  iniciarRonda(command: IniciarRondaCommand){
    return this.http.post(environment.apiBase + '/juego/ronda/iniciar', command);
  }

  ponerCarta(command: PonerCartaEnTableroCommand){
    return this.http.post(environment.apiBase + '/juego/poner', command);
  }

  getJugadores(): Observable<Jugador[]> {
    return this.afs.collection<User>(`users`).snapshotChanges().pipe(map((actions) => {
      const jugadores = actions.map(item => {
        const data = item.payload.doc.data();
        return {uid: data.uid, alias: data.displayName};
      });
      return jugadores;
    }));
  }

  getMisJuegos(uid: string): Observable<JuegoModel[]> {
    return this.http.get<JuegoModel[]>(environment.apiBase + '/juego/listar/' + uid);
   }

  getMiMazo(uid: string, juegoId: string) { 
    return this.http.get(environment.apiBase + '/juego/mazo/' + juegoId + '/' + uid);
  }

  getTablero(juegoId: string): Observable<TableroModel> { 
    return this.http.get<TableroModel>(environment.apiBase + '/juego/' + juegoId);
  }*/
}