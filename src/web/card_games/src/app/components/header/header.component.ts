import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from 'src/app/shared/services/auth.service';
@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {
  logo: string;
  constructor(private router:Router, public auth: AuthService) {
      //image location
      this.logo = '/assets/img/logo.png'
   }

  ngOnInit(): void {
  }

  conectar(){
    this.router.navigate(['login'])
  }
  logout(){
    this.auth.signOut()
  }
}
