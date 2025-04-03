import {Component} from '@angular/core';
import {RouterOutlet} from '@angular/router';
import {TaskComponent} from './task/task.component';
import {NgOptimizedImage} from '@angular/common';

@Component({
  selector: 'app-root',
  styleUrls: ['app.component.css'],
  template: `
    <main>
      <header class="brand-name">
        <img class="brand-logo" ngSrc="/assets/logo.svg" alt="logo" aria-hidden="true" height="44" width="151"/>
      </header>
      <section class="content">
        <app-task></app-task>
      </section>
    </main>`,
  imports: [
    RouterOutlet,
    TaskComponent,
    NgOptimizedImage
  ]
})
export class AppComponent {
  isEditable : boolean = true;
}

