echo "Create a secret to store Vault CA Root certificate..."
kubectl create secret generic vault-ca --from-file=/home/vagrant/consul-vault/certs/ca.pem

echo "Create a config map to store Spring vault bootstrap.yml..."
kubectl create configmap spring-vault-props --from-file=./bootstrap.yml

echo "Sustitute VAULT_TOKEN value environment variable..." 
sed -i "s/@VAULT_TOKEN@/$VAULT_TOKEN/g" deployment.yml
