
#include <iostream>
#include <string>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */
class Stock
{
	private:
		std::string m_company;
		long m_shares;
		double m_share_val;
		double m_total_val;
		void set_total()
		{
			this->m_total_val = this->m_shares*this->m_share_val;
		}
	public:
		Stock(const std::string &co, long n, double pr);
		void acquire(const std::string &co, long n, double pr);
		void buy(long n, double pr);
		void sell(long n, double pr);
		void update(double pri);
		void show();
};

Stock::Stock(const std::string &co, long n, double pr)
{
	this->m_company = co;
	this->m_shares = n;
	this->m_share_val = pr;
	this->set_total();
}
void Stock::acquire(const std::string &co, long n, double pr)
{
	this->m_company = co;
	this->m_shares = n;
	this->m_share_val = pr;
	this->set_total();
	return;
}
void Stock::buy(long n, double pr)
{
	this->m_shares += n;
	this->m_share_val = pr;
	this->set_total();
	return;
}
void Stock::sell(long n, double pr)
{
	this->m_shares -= n;
	this->m_share_val = pr;
	this->set_total();
	return;
}
void Stock::update(double pr)
{
	this->m_share_val = pr;
	this->set_total();
	return;
}
void Stock::show()
{
	std::cout<<"company: "<<this->m_company
			<<" Shares: "<<this->m_shares<<'\n'
			<<" Share Price: $"<<this->m_share_val
			<<" Total worth: $"<<this->m_total_val<<'\n';
	return;
}
int main(int argc, char** argv) {
	Stock stock = Stock("Upstar",100,1.20);
	stock.show();
	stock.acquire("Hideep", 200, 0.03);
	stock.show();
	stock.update(1.23);
	stock.show();
	return 0;
}
