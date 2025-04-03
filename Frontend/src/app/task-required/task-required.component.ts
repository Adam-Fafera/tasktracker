import { Component, Input } from '@angular/core';
import {TaskRequired} from '../task-required';

@Component({
  selector: 'app-task-required',
  imports: [],
  templateUrl: './task-required.component.html',
  styleUrl: './task-required.component.css'
})
export class TaskRequiredComponent {
  @Input() taskRequired!: TaskRequired;
}
