import { Component, OnInit } from '@angular/core';
import { AuthService } from 'src/app/shared/services/auth.service';
import { FormControl } from '@angular/forms';
import { Router } from '@angular/router';
//TODO: componente para el login con google
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  logo: String;
  constructor(public auth: AuthService, private router: Router) { 
    this.logo = '/assets/img/google-icon.svg'
  }

  ngOnInit(): void {
  }

}
