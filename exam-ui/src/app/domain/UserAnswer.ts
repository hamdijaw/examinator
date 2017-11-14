import { UserAnswerPK } from './UserAnswerPK';

export class UserAnswer {
    userAnswerPK: UserAnswerPK;
    answerEntered: string;
    entryDate: string;

    constructor(userAnswerPK: UserAnswerPK, answerEntered: string, entryDate: string) {
        this.userAnswerPK = userAnswerPK;
        this.answerEntered = answerEntered;
        this.entryDate = entryDate;
      }
}