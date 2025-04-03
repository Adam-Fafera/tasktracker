import { Component } from '@angular/core';
import { TaskRequiredComponent } from '../task-required/task-required.component';
import {TaskRequired} from '../task-required';


@Component({
  selector: 'app-task',
  imports: [TaskRequiredComponent],
  templateUrl: './task.component.html',
  styleUrl: './task.component.css'
})
export class TaskComponent {
  readonly baseUrl = 'https://angular.dev/assets/images/tutorials/common';

  taskRequired: TaskRequired = {
    id: 9999,
    description: "Meow for 20 minutes",
    createdTime: String(Date.now()),
    updatedTime: String(Date.now()),
    status: 0
  }
}
