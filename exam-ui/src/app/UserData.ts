export class UserData {
    userId: number;
    userName: string;
    phone: string;
    email: string;
    active: boolean;
    entryDate: string;

    constructor(userId: number, userName: string, phone: string, email: string, active: boolean, entryDate: string) {
        this.userId = userId;
        this.userName = userName;
        this.phone = phone;
        this.email = email;
        this.active = active;
        this.entryDate = entryDate;
      }
}