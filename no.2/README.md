## 두번째 문제 : 고객들은 드론이 필요합니다.

총 3개의 조건이 주어집니다.

회사가 보유하고 있는 드론의 수
고객의 수
각 고객들이 원하는 드론의 수

회사가 보유하고 있는 드론을 최대한 많은 고객에게 판매하고 싶습니다.
각 고객들은 본인이 필요한 만큼 드론을 확보해야 만족합니다.
현재 회사가 가진 수량으로 만족시킬 수 있는 최대 고객 수를 구하세요.

만약 C 프로그램을 이용한다면 아래와 비슷하게 시작할 것입니다.

```c
void solve(int customers[], int num_of_customers, int quantity_of_drones) {
    int max, i = 0;
    // TODO

    printf("%d", max);
    return;
}

int main()
{
    int num_of_customers = 5;  // 고객은 총 5명 입니다.
    int customers[5] = {5, 2, 1 ,3, 4};  // 각각의 고객은 5개, 2개, 1개, 3개, 4개의 드론이 필요합니다.
    int quantity_of_drones = 9; // 회사가 보유가 있는 드론의 수는 9개 입니다.
    
    solve(customers, num_of_customers, quantity_of_drones);
    return 0;
}
```

프로그램의 실행 결과는 아래와 같습니다.

```
3명
```
