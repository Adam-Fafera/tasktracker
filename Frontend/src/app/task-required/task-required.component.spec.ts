import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TaskRequiredComponent } from './task-required.component';

describe('TaskRequiredComponent', () => {
  let component: TaskRequiredComponent;
  let fixture: ComponentFixture<TaskRequiredComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [TaskRequiredComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TaskRequiredComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
