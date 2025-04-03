enum Status{
  todo,
  in_progress,
  done
}

export interface TaskRequired {
  id: number;
  description: string;
  createdTime: string;
  updatedTime: string;
  status: Status;
}
