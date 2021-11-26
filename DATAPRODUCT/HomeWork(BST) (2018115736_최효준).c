#include <stdio.h>
#include <stdlib.h>




typedef struct NodeStruct // ¦�� ����Ž��Ʈ�� ��� ����
{
    int value;
    struct NodeStruct* left;
    struct NodeStruct* right;
}Node;


 Node* root = NULL;
Node* Tree_insert(Node* root, int value) // ¦�� ����Ž��Ʈ�� �����Լ�
{
    if (root == NULL) // Ʈ���� ���� �� �� ��� ��ȯ
    {
        root = (Node*)malloc(sizeof(Node)); 
        root->left = root->right = NULL;
        root->value = value;
        return root;
    }
    else // �׷��� ���� �� ��ȯ�Ͽ� Ʈ���� ������
    {
        if (root->value > value) // �Է°��� ���� ������ ���� �� ����� ���� �Ʒ��� ����
            root->left = Tree_insert(root->left, value);
        else                                      // �Է°��� ���� ������ Ŭ �� ����� ������ �Ʒ��� ����
            root->right = Tree_insert(root->right, value);
    }
    return root; // ����� ��Ʈ ������ ��ȯ
}
Node* findMinNode(Node* root) // ���� ���� ��� ��ȯ�ϴ� �Լ�
{
    Node* tmp = root; // ��Ʈ ��� ����
    while (tmp->left != NULL) // ���� ����Ʈ���� ���� �� ���� �ݺ�
        tmp = tmp->left;
    return tmp;
}
Node* Tree_delete(Node* root, int value) // ����Ž��Ʈ�� ���� �Լ�
{
    Node* tNode = NULL; 
    if (root == NULL) //��Ʈ ��尡 NULL�̸� NULL ��ȯ
        return NULL;

    if (root->value > value)  //�����Ϸ��� ����� ���� �������� ������ ������
        root->left = Tree_delete(root->left, value); // ���� ����Ʈ���� �̵��ϰ� �ݺ�
    
    else if (root->value < value) // �ݴ��� ��쿣
        root->right = Tree_delete(root->right, value); // ���� ����Ʈ���� �̵��ϰ� �ݺ�
    
    else // �����Ϸ��� ��尡 ��Ʈ �����
    {
        // �ڽ� ��尡 �� �� ���� ���
        if (root->right != NULL && root->left != NULL)
        {
            tNode = findMinNode(root->right); // ���� ����Ʈ������ ���� ���� �� ����
            root->value = tNode->value; // ���� �� ���� ��Ʈ ��忡 ����
            root->right = Tree_delete(root->right, tNode->value); //��Ʈ�� ���� ����Ʈ�� �̵��ؼ� �ݺ�
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
Node* Tree_search(Node* root, int value) // value : ã������ ��
{
    if (root == NULL) // ��Ʈ ��尡 ������
        return NULL; // NULL��ȯ

    if (root->value == value) // ��Ʈ�� ã������ ���̸�
        return root; // ��Ʈ ��ȯ
    else if (root->value > value) // ã������ ���� ��Ʈ��庸�� ������
        return Tree_search(root->left, value); // ���� ����Ʈ�� Ž��
    else                                        // ũ��
        return Tree_search(root->right, value); // ���� ���� Ʈ�� �˻�
}
void Tree_print(Node* root) // Ʈ�� ����Լ�
{
    if (root == NULL)
        return;

    printf("%d ", root->value); // ��Ʈ�� value�� ���
    Tree_print(root->left); // ��Ʈ�� ����Ʈ�� ��� ���� ���ȣ��
    Tree_print(root->right); // ��Ʈ�� ����Ʈ�� ��� ���� ���ȣ��
}
void inorder(Node* root) // ��ȯ�� �̿��� ������ȸ
{
    if (root != NULL)
    {
        inorder(root->left); //���� ����Ʈ�� ��ȸ
        printf("[%d] ", root->value); // ��� �湮
        inorder(root->right); // ������ ����Ʈ�� ��ȸ
    }
}

#define SIZE 100 
int top = -1;
Node* stack[SIZE]; // �ڿ� ���� �� Ʈ���� ���ÿ� ������ ������ ��ȸ�ϱ� ���� ���� ����

void push(Node* p) // ���� push �Լ�
{
    if (top < SIZE - 1)
        stack[++top] = p;
}

Node* pop() // ���� pop�Լ�
{
    Node* p = NULL;
    if (top >=0) {
        p = stack[top--];
    }
    return p;
}

 // �Ʒ��� ���� ����
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
        // �ڽ� ��尡 �� �� ���� ���
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



void MakeStack(Node* root) // �ݺ��� ���� ������ȸ�� �����ϱ� ���� ���� Ʈ���� ���� ������ NULL��忡 ���� �� �� ���� ���ÿ� �߰��ϴ� �Լ�
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
void totalinorder(Node* root, Node2* root2,int k) // ¦��(root), Ȧ��(root2) Ʈ���� ���ÿ� ������������ ��ȸ�ϸ� ����ϴ� �Լ�
                                                    // int k �� ¦��, Ȧ�� Ʈ���� ������ �� ����� ����
{
  
    int i = 0;
    for (; root != NULL; root = root->left) // �켱 �� Ʈ���� ���ʰ����� ���ʷ� NULL��忡 ���� �� ������ ���ÿ� �߰�
    {
        push(root);
    }

    for (; root2 != NULL; root2 = root2->left2)
    {
        push2(root2);
    }
    while (1) { 

           
        root = pop(); // ������ �� ���� ���� �� ����
        root2 = pop2();
 
        if (root->value >= root2->value2) // root�� root2�� ����Ű�� value �� �� ���� �� ��� 
        { 
            printf("[%d] ", root2->value2); // root2�� ����Ű�� ������� �� �����Ƿ� ��� �Ŀ�
            push(root);             // root�� ���ÿ� �ٽ� ����
            root2 = root2->right2; // root2�� ������ ��带 ����Ű�� �ٲٰ�
            MakeStack2(root2); // �ݺ��� ���� �� ¦�� Ʈ���� ��ġ�� �ʱ� ���� ���� �����߰��Լ� ȣ��
            
        }
        else { // ���� �ݴ��� ���
            printf("[%d] ", root->value);
            push2(root2);
            root = root->right;
            MakeStack(root);
        }

        if (top==-1) { // ���� ���� �߿� ¦��Ʈ���� ��ȸ�� ���� ������ ��� Ȧ��Ʈ���� ���� ��ȸ
            while (1) {
                printf("[%d] ", root2->value2);
                root2 = root2->right2;
                MakeStack2(root2);
                if (!root2) break;
            }
        }
        if (top2==-1) { // ���� �ݴ��� ���
            while (1) {
                printf("[%d] ", root->value);
                root = root->right;
                MakeStack(root);
                if (!root) break;
            }
        }
        i++;
        if (i==k) break; // ������ �� ����� ������ŭ ��ȸ �� �ݺ��� Ż��
    }
  
}


int main()
{
    Node* root = NULL; // ��Ʈ
    Node2* root2 = NULL;
    int n = 50; // ������ ������ ����
    
    for (int i = 0; i < n; i++) {
        int a = 0;
        a = rand() % 100;
        if (a % 2 == 0) { // a�� ¦���� ¦�� ����Ž��Ʈ���� ����
            root = Tree_insert(root, a);
            
        }
        else { // Ȧ���� Ȧ�� ���� Ž��Ʈ���� ����
            root2 = Tree_insert2(root2, a);
            
        }
    }
    printf("-------------------[¦�� ���� Ʈ�� ������ȸ ���]------------------- \n");
    inorder(root); // ¦�� ����Ž��Ʈ�� ������ȸ
    printf("\n");
    printf("-------------------[Ȧ�� ����Ʈ�� ������ȸ ���]------------------- \n");
    inorder2(root2); // Ȧ�� ����Ž��Ʈ�� ������ȸ
    printf("\n");
    printf("-------------------[�� Ʈ�� ���ÿ� ������ ������ ��ȸ �� ����� ���]------------------- \n");
    totalinorder(root, root2,n); // �� Ʈ�� ���ÿ� ������������ ��ȸ
    return 0;
}