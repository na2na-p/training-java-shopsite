FROM mysql:8.0.30-debian

COPY ./db/my.cnf /etc/mysql/conf.d/my.cnf

#RUN chmod 644 /etc/mysql/conf.d/my.cnf \
RUN	apt-get update && apt-get install --no-install-recommends -y tini \
    && apt-get autoremove -y && apt-get clean -y && rm -rf /var/lib/apt/lists/* /root/.gnupg /tmp/library-scripts

USER mysql
ENTRYPOINT ["/usr/bin/tini", "--"]
