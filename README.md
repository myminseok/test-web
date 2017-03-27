```
mvn clean package
cf create-service dynatrace basic dynatrace-saas
cf push -f manifest-dyna.yml
```
