#include <iostream>
using namespace std;

int a[50][2];

void preorder (int N) {
	if (N == -1) return;
	cout << (char)(N+'A');
	preorder(a[N][0]);
	preorder(a[N][1]);
}

void inorder (int N) {
	if (N == -1) return;
	inorder(a[N][0]);
	cout << (char)(N+'A');
	inorder(a[N][1]);
}

void postorder (int N) {
	if (N == -1) return;
	postorder(a[N][0]);
	postorder(a[N][1]);
	cout << (char)(N+'A');
}

int main() {
	int n;
	cin >> n;
	for (int i=0; i<n; i++) {
		char x, y, z;
    cin >> x >> y >> z;
    x = x - 'A';
    if (y == '.') {
			a[x][0] = -1;
		}
		else {
			a[x][0] = y-'A';
		}
		if(z == '.') {
			a[x][1] = -1;
		}
		else {
			a[x][1] = z-'A';
		}
	}
	preorder(0);
	cout << '\n';
	inorder(0);
	cout << '\n';
	postorder(0);
	return 0;
}