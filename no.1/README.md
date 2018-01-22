## 첫번째 문제 : Linked-List를 거꾸로 하자

1) linked-list의 자료구조와 push() 함수를 구현하세요.
2) 5개를 element를 push 하세요.
3) 가장 먼저 넣은 element부터 출력하는 printReverse() 함수를 구현하세요.

만약 C 프로그램을 이용한다면 아래와 비슷하게 시작할 것입니다.

```c
printReverse() {
  // TODO 
}

push() {
  // TODO
}

int main() {
  struct Node* head = NULL;
  push(&head, 5)
  push(&head, 4)
  push(&head, 3)
  push(&head, 2)
  push(&head, 1)

  printReverse(head);
  return 0;
}
```

프로그램의 실행 결과는 아래와 같습니다.

```
5 4 3 2 1
```
