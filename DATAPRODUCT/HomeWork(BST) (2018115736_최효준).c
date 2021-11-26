#include <stdio.h>
#include <stdlib.h>




typedef struct NodeStruct // 짝수 이진탐색트리 노드 생성
{
    int value;
    struct NodeStruct* left;
    struct NodeStruct* right;
}Node;


 Node* root = NULL;
Node* Tree_insert(Node* root, int value) // 짝수 이진탐색트리 삽입함수
{
    if (root == NULL) // 트리가 공백 시 새 노드 반환
    {
        root = (Node*)malloc(sizeof(Node)); 
        root->left = root->right = NULL;
        root->value = value;
        return root;
    }
    else // 그렇지 않을 시 순환하여 트리를 내려감
    {
        if (root->value > value) // 입력값이 기존 값보다 작을 시 노드의 왼쪽 아래에 삽입
            root->left = Tree_insert(root->left, value);
        else                                      // 입력값이 기존 값보다 클 시 노드의 오른쪽 아래에 삽입
            root->right = Tree_insert(root->right, value);
    }
    return root; // 변경된 루트 포인터 반환
}
Node* findMinNode(Node* root) // 가장 작은 노드 반환하는 함수
{
    Node* tmp = root; // 루트 노드 복사
    while (tmp->left != NULL) // 왼쪽 서브트리가 없을 때 까지 반복
        tmp = tmp->left;
    return tmp;
}
Node* Tree_delete(Node* root, int value) // 이진탐색트리 삭제 함수
{
    Node* tNode = NULL; 
    if (root == NULL) //루트 노드가 NULL이면 NULL 반환
        return NULL;

    if (root->value > value)  //삭제하려는 노드이 값이 루느노드의 값보다 작으면
        root->left = Tree_delete(root->left, value); // 왼쪽 서브트리로 이동하고 반복
    
    else if (root->value < value) // 반대의 경우엔
        root->right = Tree_delete(root->right, value); // 우측 서브트리로 이동하고 반복
    
    else // 삭제하려는 노드가 루트 노드라면
    {
        // 자식 노드가 둘 다 있을 경우
        if (root->right != NULL && root->left != NULL)
        {
            tNode = findMinNode(root->right); // 우측 서브트리에서 가장 작은 값 복사
            root->value = tNode->value; // 복사 한 값을 루트 노드에 복사
            root->right = Tree_delete(root->right, tNode->value); //루트의 우측 서브트리 이동해서 반복
        }
        else
        {
            tNode = (root->left == NULL) ? root->right : root->left;
            free(root);
            return tNode;
        }
    }

    return root;
}
Node* Tree_search(Node* root, int value) // value : 찾으려는 값
{
    if (root == NULL) // 루트 노드가 없으면
        return NULL; // NULL반환

    if (root->value == value) // 루트가 찾으려는 값이면
        return root; // 루트 반환
    else if (root->value > value) // 찾으려는 값이 루트노드보다 작으면
        return Tree_search(root->left, value); // 좌측 하위트리 탐색
    else                                        // 크면
        return Tree_search(root->right, value); // 우측 하위 트리 검색
}
void Tree_print(Node* root) // 트리 출력함수
{
    if (root == NULL)
        return;

    printf("%d ", root->value); // 루트의 value값 출력
    Tree_print(root->left); // 루트의 좌측트리 출력 위해 재귀호출
    Tree_print(root->right); // 루트의 우측트리 출력 위해 재귀호출
}
void inorder(Node* root) // 순환을 이용한 중위순회
{
    if (root != NULL)
    {
        inorder(root->left); //왼쪽 서브트리 순회
        printf("[%d] ", root->value); // 노드 방문
        inorder(root->right); // 오른쪽 서브트리 순회
    }
}

#define SIZE 100 
int top = -1;
Node* stack[SIZE]; // 뒤에 있을 두 트리를 동시에 오름차 순으로 순회하기 위해 스택 생성

void push(Node* p) // 스택 push 함수
{
    if (top < SIZE - 1)
        stack[++top] = p;
}

Node* pop() // 스택 pop함수
{
    Node* p = NULL;
    if (top >=0) {
        p = stack[top--];
    }
    return p;
}

 // 아래는 위와 동일
typedef struct Node2Struct
{
    int value2;
    struct Node2Struct* left2;
    struct Node2Struct* right2;
}Node2;

Node2* root2 = NULL;



Node2* Tree_insert2(Node2* root2, int value2)
{
    if (root2 == NULL)
    {
        root2 = (Node2*)malloc(sizeof(Node2));
        root2->left2 = root2->right2 = NULL;
        root2->value2 = value2;
        return root2;
    }
    else
    {
        if (root2->value2 > value2)
            root2->left2 = Tree_insert2(root2->left2, value2);
        else
            root2->right2 = Tree_insert2(root2->right2, value2);
    }
    return root2;
}
Node2* findMinNode2(Node2* root2)
{
    Node2* tmp = root2;
    while (tmp->left2 != NULL)
        tmp = tmp->left2;
    return tmp;
}
Node2* Tree_delete2(Node2* root2, int value2)
{
    Node2* tNode2 = NULL;
    if (root2 == NULL)
        return NULL;

    if (root2->value2 > value2)
        root2->left2 = Tree_delete2(root2->left2, value2);
    else if (root2->value2 < value2)
        root2->right2 = Tree_delete2(root2->right2, value2);
    else
    {
        // 자식 노드가 둘 다 있을 경우
        if (root2->right2 != NULL && root2->left2 != NULL)
        {
            tNode2 = findMinNode2(root2->right2);
            root2->value2 = tNode2->value2;
            root2->right2 = Tree_delete2(root2->right2, tNode2->value2);
        }
        else
        {
            tNode2 = (root2->left2 == NULL) ? root2->right2 : root2->left2;
            free(root2);
            return tNode2;
        }
    }

    return root2;
}
Node2* Tree_search2(Node2* root2, int value2)
{
    if (root2 == NULL)
        return NULL;

    if (root2->value2 == value2)
        return root2;
    else if (root2->value2 > value2)
        return Tree_search2(root2->left2, value2);
    else
        return Tree_search2(root2->right2, value2);
}
void Tree_print2(Node2* root2)
{
    if (root2 == NULL)
        return;

    printf("%d ", root2->value2);
    Tree_print2(root2->left2);
    Tree_print2(root2->right2);
}

void inorder2(Node2* root2)
{
    if (root2 != NULL) {
        inorder2(root2->left2);
        printf("[%d] ", root2->value2);
        inorder2(root2->right2);
    }
}

Node2* stack2[SIZE];
int top2 = -1;
void push2(Node2* p2)
{
    if (top2 < SIZE - 1)
        stack2[++top2] = p2;
}

Node2* pop2()
{
    Node2* p2 = NULL;
    if (top2 >= 0) {
        p2 = stack2[top2--];
    }
    return p2;
}



void MakeStack(Node* root) // 반복을 통한 중위순회를 구현하기 위해 이진 트리의 왼쪽 노드들을 NULL노드에 도달 할 때 까지 스택에 추가하는 함수
{
    for (; root != NULL; root = root->left)
    {
        push(root);
    }
}
   
void MakeStack2(Node2* root2)
{
    for (; root2 != NULL; root2 = root2->left2)
    {
        push2(root2);
    }
}
void totalinorder(Node* root, Node2* root2,int k) // 짝수(root), 홀수(root2) 트리를 동시에 오름차순으로 순회하며 출력하는 함수
                                                    // int k 는 짝수, 홀수 트리에 생성된 총 노드의 개수
{
  
    int i = 0;
    for (; root != NULL; root = root->left) // 우선 각 트리의 왼쪽값들을 차례로 NULL노드에 도달 할 때까지 스택에 추가
    {
        push(root);
    }

    for (; root2 != NULL; root2 = root2->left2)
    {
        push2(root2);
    }
    while (1) { 

           
        root = pop(); // 스택의 맨 윗값 복사 및 삭제
        root2 = pop2();
 
        if (root->value >= root2->value2) // root와 root2가 가리키는 value 비교 후 작은 값 출력 
        { 
            printf("[%d] ", root2->value2); // root2가 가리키는 밸류값이 더 작으므로 출력 후에
            push(root);             // root는 스택에 다시 삽입
            root2 = root2->right2; // root2는 오른쪽 노드를 가리키게 바꾸고
            MakeStack2(root2); // 반복의 과정 중 짝수 트리와 겹치지 않기 위해 따로 스택추가함수 호출
            
        }
        else { // 위와 반대의 경우
            printf("[%d] ", root->value);
            push2(root2);
            root = root->right;
            MakeStack(root);
        }

        if (top==-1) { // 위의 과정 중에 짝수트리의 순회가 먼저 끝났을 경우 홀수트리만 따로 순회
            while (1) {
                printf("[%d] ", root2->value2);
                root2 = root2->right2;
                MakeStack2(root2);
                if (!root2) break;
            }
        }
        if (top2==-1) { // 위와 반대의 경우
            while (1) {
                printf("[%d] ", root->value);
                root = root->right;
                MakeStack(root);
                if (!root) break;
            }
        }
        i++;
        if (i==k) break; // 생성된 총 노드의 개수만큼 순회 후 반복문 탈출
    }
  
}


int main()
{
    Node* root = NULL; // 루트
    Node2* root2 = NULL;
    int n = 50; // 생성할 난수의 개수
    
    for (int i = 0; i < n; i++) {
        int a = 0;
        a = rand() % 100;
        if (a % 2 == 0) { // a가 짝수면 짝수 이진탐색트리에 삽입
            root = Tree_insert(root, a);
            
        }
        else { // 홀수면 홀수 이진 탐색트리에 삽입
            root2 = Tree_insert2(root2, a);
            
        }
    }
    printf("-------------------[짝수 이진 트리 중위순회 결과]------------------- \n");
    inorder(root); // 짝수 이진탐색트리 중위순회
    printf("\n");
    printf("-------------------[홀수 이진트리 중위순회 결과]------------------- \n");
    inorder2(root2); // 홀수 이진탐색트리 중위순회
    printf("\n");
    printf("-------------------[두 트리 동시에 오름차 순으로 순회 후 출력한 결과]------------------- \n");
    totalinorder(root, root2,n); // 두 트리 동시에 오름차순으로 순회
    return 0;
}